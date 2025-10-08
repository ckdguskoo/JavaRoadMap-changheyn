## 은행 계좌 관리


기능 : 생성,삭제, 입금, 출금, 잔액조회, 거래 내역 저장(거래내역을 리스트로 자장해서 인덱스로 접근)

DB : 계좌(Pr),잔액, CRUD

중복처리, 예외처리, 데이터 구조

### 계층 분리 (Layered Architecture)
Service: 비즈니스 로직

Repository/DAO: 데이터베이스 접근

각 계층의 역할을 명확히 구분하세요

### DTO (Data Transfer Object)
API 요청/응답 데이터 전달용

엔티티와 분리해서 사용 (보안, 유연성)

Request DTO와 Response DTO를 구분하면 좋아요

### DAO/Repository
데이터베이스 CRUD 작업 담당

비즈니스 로직은 Service 계층에!

## 꼭 고려해야 할 것들
### 예외 처리
전역 예외 핸들러 구현

커스텀 예외 클래스 정의

적절한 HTTP 상태 코드 반환

### 유효성 검증 (Validation)
입력 데이터 검증 (예: @Valid, @NotNull)

비즈니스 규칙 검증

### 보안
비밀번호 암호화 (BCrypt 등)

인증/인가 (JWT, Session 등)

SQL Injection 방지 (Prepared Statement)

### 데이터베이스
트랜잭션 관리 (@Transactional)

인덱스 설계

N+1 쿼리 문제 주의 

## 프로젝트 구조
- Main: 프로그램 시작점, 메뉴 루프

- Service: 비즈니스 로직

- Repository/DAO: DB 접근

- DTO: 데이터 전달

- Entity: DB 테이블 매핑

- Utils: 입력 검증, 포맷팅 등
