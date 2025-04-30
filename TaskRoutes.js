const express = require('express');
const router = express.Router();
const Task = require('../models/Task');

router.get('/tasks', async (req, res) => {
  const tasks = await Task.find();
  res.json(tasks);
});

router.post('/task', async (req, res) => {
  const newTask = new Task(req.body);
  await newTask.save();
  res.json(newTask);
});


router.put('/task', async (req , res)=>
{
     const newTask = new Task(req.body);
     await newTask.put();

     res.json(newTask);
});


router.delete('/task', async (req , res)=>
    {
         const newTask = new Task(req.body);
         await newTask.delete();    
         res.json(newTask);
    });

    export default TaskRoutes;