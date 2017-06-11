package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by Hao HOU on 2017/6/11.
 */
@Controller
@RequestMapping("/fileupload")
public class FileUploadController {
    @RequestMapping(method = RequestMethod.GET)
    public String uploadForm() {
        return "uploadForm";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String processUpload(@RequestPart("file") MultipartFile file) throws Exception{

        file.transferTo(new File("/tmp/spittr/" + file.getOriginalFilename()));

        System.out.println(file.getSize());

        System.out.println("---->  " + file.getOriginalFilename() + "  ::  "  + file.getSize());

        return "redirect:/homepage";
    }
}
