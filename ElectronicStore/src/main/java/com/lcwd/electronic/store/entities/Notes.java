package com.lcwd.electronic.store.entities;



public class Notes {

    // if any error occure on image uploading then default value check karavi lagel kiva img size ,img path. default value ho
  // jr application.properties madhe path dila tr tayala @value yane value pass kratat


    /*
  *  step-1 create entity class
  *
  * step-2 create productDto
  * ( yat same entity  field astat  tayala msg pass krtat jene karun error show hoin  )
  *   ex- user ni price blank submit keli tr tayala msg show krne.
  *    @Notblank(message="please enter amount ");
  *    @Size(message="please enter amount ");
  *
  *  Step-3 Create Repositories
  *    search
  *
  *   step-4 create ProductService
  *   here create crud opration  . pass DTO class
  *   search, getall asel then used list
  *
  *   step-5 create  ProductServiceImpl
  *
  *    implement interface ,then override method
  *    @service  yamule inject kru shakto class kut pan
  *
  *    create object of repository then @Autowired and @Autowired Modelmapper
  *
  *
  *     step-6  create Controller ( for API)
  *         1)createUser
  *         2)deleteUser
  *         3)getAllUsers
  *         4)getUserByEmail
  *         5)searchUser
  *         6)uploadUserImage
  *         7)serveUserImage
  *
  *
  *
  *
  *
  *
  *
  *
  *
  *
  *
  * */
}
