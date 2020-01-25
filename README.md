# myprj2_clothesShoppingMall

# <strong> 1. 프로젝트 소개 </strong>
프로젝트 명 : ALL Buy Shopping Mall
- 멀티쇼핑몰 
- 쇼핑몰의 기본 기능 구현에 집중한 프로젝트
- 관리자와 소비자 프로그램

# <strong> 2. 프로젝트 기능 </strong> 
=======<strong>사용자  User</strong>=======\
＊ 로그인 / 회원가입 \
＊ 아이디 / 비밀번호 찾기 \
＊ 메인화면 ( 회원 / 비회원 ) \
＊ 마이페이지 (주문내역, 회원정보수정, 카드등록, 찜하기)  \
＊ 상품조회 ( Brand / SOHO )

------------------------------------------------------------------------
=======<strong>관리자 admin</strong>=======\
＊ 로그인\
＊ 상품조회( Brand / SOHO )\
＊ 회원관리\
＊ 상품관리\
＊ 주문관리\
＊ 브랜드 / 카테고리 관리\
＊ 정산

------------------------------------------------------------------------

# <strong> 3. 사용방법 </strong> 
1. git 연결 
2. DB dmp파일을 다운 받고, import
3. util 폴더에 있는 jar파일을 다운받고, eclipse에 buildpath 
4. 아래의 경로대로 실행 
- 관리자 (admin)\
admin 패키지 ->run 패키지 ->StaticCla 클래스에서 FILE_PATH 이미지 경로변경-> UserRun 클래스를 실행 -> 관리자 프로그램 실행 

관리자 아이디 : shopper
관리자 비밀번호 : shmall


- 소비자 (user)\
user 패키지 -> view패키지 -> login패키지 -> ClientLoginView 클래스에서 USER_FILE_PATH 이미지 경로 변경 ->run  패키지
-> UserRun 패키지 실행 -> 소비자 프로그램 실행  

