## 4주차, 나만의 셀렉샵

 ### 필요한 기능
 1. 키워드로 상품 검색 -> 그 결과를 목록으로 보여주기
 2. 관심 상품 등록하기
 3. 관심 상품 조회하기
 4. 관심 상품에 원하는 가격을 등록하고, 그 가격보다 낮은 경우 표시하기
 
 </br>
 

 
####  Controller
  + ProductRestController: 관심 상품 관련 컨트롤러
  + SearchRequestController: 검색 관련  컨트롤러
  
 
####  Service
  + ProductService: 관심 상품 가격 변경
  

####  Repository
  + Product: 관심 상품 테이블
  + ProductRepository: 관심 상품 조회, 저장
  + ProductRequestDto: 관심 상품 등록하기
  + ProductMypriceRequestDto: 관심 가격 변경하기
  + ItemDto: 검색 결과 주고받기
  
