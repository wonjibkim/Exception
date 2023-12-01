package kopo.poly.service;

import kopo.poly.dto.AlarmMsgDTO;
import kopo.poly.dto.DeviceDTO;

import java.util.List;

public interface IAlarmService {


    // 사용자별 기기 Token 저장
    int saveToken(DeviceDTO pDTO)throws Exception;

    // 디바이스 TOKEN 가져오기
    List<String> getDevice(String userId)throws Exception;

    // 메세지 보내기
    int sendMessing(AlarmMsgDTO pDTO)throws Exception;
}
