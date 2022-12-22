//package com.sparta.hanghaestartproject.controller;
//
//import com.amazonaws.Response;
//import com.sparta.hanghaestartproject.service.AwsS3Service;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping
//public class AmazonS3Controller {
//
//    private final AwsS3Service awsS3Service
//
//    /**
//     * Amazon S3에 파일 업로드
//     * @return 성공 시 200 Success와 함께 업로드 된 파일의 파일명 리스트 반환
//     */
//
//    @PostMapping("/file")
//    public ResponseEntity<List<String>> uploadFile(@ApiParam(value="파일들(여러 파일 업로드 가능)", required = true)
//                                                   @RequestPart List<MultipartFile> multipartFile){
//        return ApiResponse.success(awsS3Service.upload(multipartFile));
//    }
//
//
//    /**
//     * Amazon S3에 업로드 된 파일 삭제
//     * @Return 성공 시 200 success
//     */
//
//    @DeleteMapping("/file")
//    public Response<Void> deleteFile(@ApiParam(value="파일 하나 삭제", required=true) @RequestParam String fileName){
//        awsS3Service.deleteImage(fileName);
//        return ApiResponse.success(null);
//    }
//
//
//}