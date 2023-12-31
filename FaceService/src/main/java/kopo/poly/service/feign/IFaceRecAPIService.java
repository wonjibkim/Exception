package kopo.poly.service.feign;

import kopo.poly.dto.FaceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// Face Recognize API : 이미지가 입력되면, 관리 중인 Face 중 유사한 것들을 찾아서 반환함 (기준:threshold)
@FeignClient(name = "FaceRecAPI", url = "https://apis.openapi.sk.com/nugufacecan/v1/recognize")
public interface IFaceRecAPIService {

    /**
     * @param group_id  비교를 진행할 Group의 id
     * @param image  비교 대상 Face image (base64)
     * @return 주어진 Face image와 닮은 Subject(사람) 리스트를 반환
     */
      @PostMapping(value = "/",
              consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
      )
      List<FaceDTO> getRecognizedList(
              @RequestHeader("group-id") String group_id,
              @RequestHeader("threshold") double threshold,
              @RequestHeader("multi") int multi,
              @RequestPart("image") MultipartFile image
              );

}
