package MyBlog.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BlogController {
	private static final Log logger = LogFactory.getLog(BlogController.class);
	
	@RequestMapping(value="/main")
	public String mainPage() {
		return "Main";
	}
	
	@RequestMapping(value="/image/{name}", method=RequestMethod.GET)
	public void getImages(@PathVariable String name, HttpServletRequest request, 
			HttpServletResponse response, @RequestHeader String referer)
	{
		if (referer != null) {
			String dir = request.getServletContext().getRealPath("/WEB-INF/image");
			
			File file = new File(dir, name+".jpg");
			if (file.exists()) {
				response.setContentType("image/jpg");
				byte[] buffer = new byte[1024];
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					OutputStream os = response.getOutputStream();
					
					int i = bis.read(buffer);
					while(i != -1) {
						os.write(buffer, 0, i);
						i = bis.read(buffer);
					}
				}catch(IOException e) {e.printStackTrace();}
				finally {
					if (fis != null) {
						try {
							fis.close();
						}catch(IOException e) {}
					}
					
					if (bis != null) {
						try {
							bis.close();
						}catch(IOException e) {}
					}
				}
			}
		}
	}
}
