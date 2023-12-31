package kopo.poly.jwt;

public enum JwtStatus {
    ACCESS, // 유효한 토큰
    DENIED,// 유효하지 않는 토큰
    EXPIRED // 만료된 토큰(재발행 등 활용)
}
