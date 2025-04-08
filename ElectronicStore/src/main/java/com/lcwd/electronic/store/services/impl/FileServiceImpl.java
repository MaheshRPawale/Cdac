package com.lcwd.electronic.store.services.impl;

import com.lcwd.electronic.store.exceptions.BadApiRequest;
import com.lcwd.electronic.store.services.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    // images sati aahe ha class

   private Logger logger= LoggerFactory.getLogger(FileServiceImpl.class);

    @Override
    public String uploaadFile(MultipartFile file, String path) throws IOException {

        String originalFilename = file.getOriginalFilename();
    logger.info("Filename : {}",originalFilename);
    String filename= UUID.randomUUID().toString();  // random id
    String extension= originalFilename.substring(originalFilename.lastIndexOf("."));  // .extension chya nantr jopan extension asel te automatic add hoin
    String fileNameWithExtension= filename+extension;  // concat
    String fullPathWithFileName=path +fileNameWithExtension;  // seprator he os sati aahe .because windows and obuntu madhe different way aahet

    logger.info("full image path {}",fullPathWithFileName);
    if(extension.equalsIgnoreCase(".png") || extension.equalsIgnoreCase(".jpg") || extension.equalsIgnoreCase(".jpeg.")){

        // file save
        logger.info("file extension is {} ",extension);
        File folder = new File(path);
        if (!folder.exists()){
            // create the folder
            folder.mkdirs();  //mkdirs() parent madhe chiled folder astil tr
                              // mkdir he only single folder asel tr
        }
        // upload file
        Files.copy(file.getInputStream(), Paths.get(fullPathWithFileName));
        return fileNameWithExtension;


    }
    else {
        throw new BadApiRequest("File with this "+extension+"not allowed !!");
    }

    }

    @Override
    public InputStream getResource(String path, String name) throws FileNotFoundException {

        String fullPath= path + File.separator +name;
        InputStream inputStream =new FileInputStream(fullPath);
        return inputStream;
    }




}
