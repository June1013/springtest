package controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import service.FileService;

@RequiredArgsConstructor
@Controller
public class FileController {
	
	private final FileService fileService;
	
	@GetMapping("/")
	public String mainPage() {
		return "mainpage";
	}
		
	
	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		
		fileService.saveFile(file);
		return "mainpage";
		
	}
	
	
	
	
	
}
