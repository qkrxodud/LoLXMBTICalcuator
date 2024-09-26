# LoL MBTI Calculator

## 프로젝트 설명
**LoL MBTI Calculator**는 사용자가 MBTI 질문을 통해 자신의 성격 유형을 확인하고, 해당 MBTI 유형에 기반하여 `League of Legends`(LoL)에서 가장 적합한 역할을 제안해주는 웹 애플리케이션입니다. 이 애플리케이션은 Spring Boot로 개발되었으며, 데이터는 MBTI 질문과 League of Legends 포지션 간의 매핑을 기반으로 구성되어 있습니다.

## 주요 기능
- **MBTI 테스트**: 사용자에게 MBTI 관련 질문을 제공하여 MBTI 성격 유형을 진단.
- **League of Legends 포지션 추천**: MBTI 성격 유형을 기반으로 LoL 포지션을 추천.
- **결과 페이지**: 사용자가 테스트를 완료하면 결과 페이지로 리다이렉트되어 추천된 포지션을 확인.
- **아이콘 관리**: 아이콘 이미지 경로를 데이터베이스에서 관리.
- **결과 공유 버튼**: 테스트 결과를 쉽게 공유할 수 있는 버튼 제공.

## 프로젝트 구조
com.example.demo │ ├── controller # 컨트롤러 계층, 웹 요청을 처리 ├── domain # 주요 도메인 클래스 (Question, MBTI, LoLPosition 등) ├── service # 비즈니스 로직 처리 ├── repository # 데이터베이스 연동 및 데이터 관리 ├── resources │ ├── static # 정적 리소스 (CSS, 이미지 등) │ └── templates # Thymeleaf 템플릿 파일 └── application.yml # 애플리케이션 설정 파일


## 도메인 설명
- **Question**: MBTI 테스트 질문을 관리하는 도메인 클래스.
- **MBTI**: 각 성격 유형에 대한 로직과 정보를 관리.
- **LoLPosition**: League of Legends의 역할(포지션)에 대한 정보를 관리.

## API 엔드포인트
- `GET /questions`: MBTI 테스트 질문을 가져옵니다.
- `POST /submit`: 사용자가 답변을 제출하면 해당 MBTI 유형을 분석하여 결과를 반환합니다.
- `GET /result`: 분석된 MBTI와 그에 맞는 LoL 포지션을 확인할 수 있는 결과 페이지로 리다이렉트합니다.

## 설치 및 실행 방법
1. 프로젝트 클론:
   git clone https://github.com/qkrxodud/LoLXMBTICalcuator.git
   
3. 프로젝트 디렉토리로 이동:
  cd LoLXMBTICalcuator

4. 의존성 설치 및 빌드:
mvn clean install

5. 애플리케이션 실행:
mvn spring-boot:run

애플리케이션은 기본적으로 http://localhost:8080에서 실행됩니다.

## 사용 기술
- **Spring Boot**: Java 기반의 웹 프레임워크
- **Thymeleaf**: 서버 사이드 템플릿 엔진으로 동적 HTML 콘텐츠 생성
- **MyBatis / JPA**: 데이터베이스 연동
- **Lombok**: 코드 간소화 (Getter, Setter 등 자동 생성)

## 데이터베이스 구조
현재 프로젝트는 데이터베이스 연동이 포함되어 있으나, 테스트 및 아이콘 경로 관리에 사용됩니다. 데이터베이스 연동은 JPA 또는 MyBatis를 통해 처리되며, 주요 테이블은 다음과 같습니다:

- **Question 테이블**: MBTI 질문 저장
- **LoLPosition 테이블**: 각 LoL 포지션의 설명과 관련 이미지 저장

## 앞으로의 개발 방향
- **결과 공유 기능 개선**: 결과를 소셜 미디어에 바로 공유할 수 있는 버튼 추가 예정.
- **UI 개선**: 사용자의 시각적 경험을 향상시키기 위해 더 많은 동적 요소 및 애니메이션 추가 예정.

## 기여 방법
1. 이 프로젝트를 포크(fork)합니다.
2. 새로운 브랜치(`feature-브랜치이름`)를 생성합니다.
3. 변경 사항을 커밋합니다.
4. 푸시한 후, Pull Request를 요청합니다.
