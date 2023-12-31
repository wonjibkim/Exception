package kopo.poly.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NOTICE")
@DynamicInsert
@DynamicUpdate
@Builder
@Cacheable
@Entity
public class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 국내 실종자 SEQ
    @Column(name = "notice_seq")
    private Long noticeSeq;

    @NonNull
    @Column(name = "writngTrgetDscd",  nullable = false)  // 대상구분
    private String writngTrgetDscd;

    @NonNull
    @Column(name = "detailTrgetDscd",  nullable = false) // 상세구분
    private String detailTrgetDscd;

    @NonNull
    @Column(name = "occrde",  nullable = false) // 발생일시
    private String occrde;

    @NonNull
    @Column(name = "nm",  nullable = false)  // 성명
    private String nm;

    @NonNull
    @Column(name = "sexdstnDscd",  nullable = false)  // 성별구분
    private String sexdstnDscd;

    @Column(name = "faceshpe_dscd",  nullable = false) //얼굴형
    private String faceshpeDscd;

    @Column(name = "birth_dt",  nullable = false) // 출생년도
    private String birthDt;

    @NonNull
    @Column(name = "age",  nullable = false) // 당시나이
    private String age;

    @Column(name = "height",  nullable = false)  // 키
    private String height;

    @Column(name = "frm_dscd",  nullable = false)//체격
    private String frmDscd;

    @Column(name = "hairshpe_dscd",  nullable = false) //두발형태
    private String hairshpeDscd;

    @Column(name = "haircolr_dscd",  nullable = false) //두발색상
    private String haircolrDscd;

    @NonNull
    @Column(name = "alldressing_dscd",  nullable = false)  // 착의사항
    private String alldressingDscd;

    @NonNull
    @Column(name = "occr_adres",  nullable = false)  // 발생장소
    private String occrAdres;

    @NonNull // 인물 Face 정보 관리할 Subject 식별자 -> 삭제에 사용
    @Column(name = "subject_id", nullable = false)
    private String subjectId;

    @NonNull // 인물 Face 정보 관리할 Subject 이름 -> 생성, 조회에 사용
    @Column(name = "subject_name", nullable = false)
    private String subjectName; // 등록자Id + 실종자명

    @NonNull // 인물 사진 URL1
    @Column(name = "face_img_url1", nullable = false)
    private String faceImgUrl1; // https://버킷/subject_name1.jpg

    @NonNull // 인물 사진 URL2
    @Column(name = "face_img_url2", nullable = false)
    private String faceImgUrl2; // https://버킷/subject_name2.jpg

    @NonNull
    @Column(name = "title", nullable = false)
    private String title; // 제목

    @NonNull
    @Column(name = "read_cnt", nullable = false)
    private Long readCnt; // 조회수

    @NonNull
    @Column(name = "reg_id", nullable = false)
    private String regId; // 등록자 아이디

    @NonNull
    @Column(name = "reg_dt", nullable = false)
    private String regDt; // 등록일

    @NonNull
    @Column(name = "chg_id", nullable = false)
    private String chgId; // 수정자 아이디

    @NonNull
    @Column(name = "chg_dt", nullable = false)
    private String chgDt; // 수정일

}
