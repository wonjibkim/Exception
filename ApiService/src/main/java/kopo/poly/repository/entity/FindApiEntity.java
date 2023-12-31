package kopo.poly.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FIND_API")
@DynamicInsert
@DynamicUpdate
@Builder
@Cacheable
@Entity
public class FindApiEntity {

    @Id // API SEQ
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "findApi_seq")
    private Long findApiSeq;

    @NonNull// 발생일시
    @Column(name = "occrde",  nullable = false)
    private String occrde;

    @NonNull// 착의사항
    @Column(name = "alldressing_dscd",  nullable = false)
    private String alldressingDscd;

    @NonNull//현재나이
    @Column(name = "age_now",  nullable = false)
    private String ageNow;

    @NonNull // 당시나이
    @Column(name = "age",  nullable = false)
    private String age;

    @NonNull//대상구분
    @Column(name = "writngTrgetDscd",  nullable = false)
    private String writngTrgetDscd;

    @NonNull //성별구분
    @Column(name = "sexdstnDscd",  nullable = false)
    private String sexdstnDscd;

    @NonNull// 발생장소
    @Column(name = "occr_adres",  nullable = false)
    private String occrAdres;


    @NonNull//성명
    @Column(name = "nm",  nullable = false)
    private String nm;

    @NonNull// 인물 사진
    @Column(name = "msspsn_idntfccd", nullable = false)
    private String msspsnIdntfccd;



}
