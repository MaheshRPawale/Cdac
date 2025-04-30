import React, { useEffect, useState } from "react";
import axios from "axios";

const Apis = () => {
  const [tasks, setTasks] = useState([]);
  const [newTask, setNewTask] = useState("");

  useEffect(() => {
    fetchTasks();
  }, []);

  const fetchTasks = async () => {
    const response = await axios.get("http://localhost:5000/api/tasks");
    setTasks(response.data);
  };

  const addTask = async () => {
    if (newTask.trim() !== "") {
      await axios.post("http://localhost:5000/api/task", { title: newTask });
      setNewTask("");
      fetchTasks();
    }
  };

  const deleteTask = async (id) => {
    await axios.delete(`http://localhost:5000/api/task/${id}`);
    fetchTasks();
  };

  return (
    <div style={{ padding: "20px", maxWidth: "400px", margin: "auto", textAlign: "center" }}>
      <h2>To-Do List</h2>
      <input 
        type="text"
        value={newTask}
        onChange={(e) => setNewTask(e.target.value)}
        placeholder="Add a new task"
      />
      <button onClick={addTask}>Add Task</button>
      <ul>
        {tasks.map((task) => (
          <li key={task._id}>
            {task.title} <button onClick={() => deleteTask(task._id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Apis;
