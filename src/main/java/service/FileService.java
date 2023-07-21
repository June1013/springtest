package service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
	
	public void saveFile(MultipartFile file) throws IllegalStateException, IOException {
		String realName = file.getOriginalFilename();//파일 네임 가져오기
		String savedPath = "C:\\June\\uploadFolder\\" + realName; //파일저장경로지정
		
		file.transferTo(new File(savedPath));
		
	}

}
