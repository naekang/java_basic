# Chapter 05 - 배열 array
---

#### 배열이란?
- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
- 생성
  ```java
  // 타입[] 변수이름 = new 타입[길이];
  int[] score = new int[5];
  // int의 default값인 0으로 초기화 
  ```
  
#### 배열의 길이와 인덱스
- 0부터 시작
- 유효한 범위를 벗어난 인덱스 사용시 `ArrayIndexOutBoundsException` 에러 발생

#### 배열의 길이
- 배열의 길이는 int범위의 양의 정수(0도 포함)
- `배열의길이.length`를 통해 길이를 구할 수 있음
  ```java
  int[] arr = new int[5];
  int tmp = arr.length; // 5
  ```
- 배열의 길이를 이용해 반복문을 사용할 때 조건문에 직접 정수로 지정하는 것보다 .length 방식을 이용하는 것이 좋음

#### 배열의 초기화
- 각 값에 직접 지정하는 것이 아니면 default 값으로 초기화

#### 배열의 복사
1. for문을 사용하여 저장
  - 비용이 많이 듦
2. `System.arraycopy()`를 이용
  - 지정 범위 값들을 한 번에 복사
  - for문보다 효율적

#### 배열의 활용
- [총합과 평균](../ch05/src/ArrayEx5.java)
- [최대값과 최소값](../ch05/src/ArrayEx6.java)
- [섞기1](../ch05/src/ArrayEx7.java)
- [섞기2](../ch05/src/ArrayEx8.java)
- [임의의 값으로 배열 채우기](../ch05/src/ArrayEx9.java)
- [정렬하기](../ch05/src/ArrayEx10.java)

#### String 배열
- `String[] name = new String[3];`

#### 변수의 타입에 따른 기본값
  자료형|기본값
  ---|---
  boolean|false
  char|'\u0000'
  byte, short, int|0
  long|0L
  float|0.0f
  double|0.0d or 0.0
  참조형 변수|null

#### String배열의 초기화
- [예제 코드](../ch05/src/ArrayEx12.java)

#### char배열과 String클래스
> String 클래스는 char배열에 메서드를 추가한 것

#### String클래스의 주요 메서드
메서드|설명
---|---
`char charAt(int index)`|문자열에서 해당 위치에 있는 문자 반환
`int length()`|문자열의 길이 반환
`String substring(int from, int to)`|문자열에서 해당 범위(from ~ to)에 있는 문자열 반환
`boolean equals(String str)`|문자열의 내용이 같은지 확인
`char[] toCharArray()`|문자열을 문자배열(char[])로 변환

#### 다차원 배열
- `int[][] score = new int[4][3];` = 4행 3열의 2차원 배열 생성
- 2차원 배열의 초기화: `int[][] arr = new int[][]{ {1,2,3}, {4,5,6} };`

#### 가변 배열
- `int[][] score = new int[5][];` 처럼 배열을 생성하면 각 행마다 다른 길이의 배열 생성 가능 

#### 다차원 배열의 활용
- [좌표에 X표 하기](../ch05/src/MultiArrEx1.java)
- [빙고](../ch05/src/MultiArrEx2.java)
- [행렬의 곱셈](../ch05/src/MultiArrEx3.java)
- [단어 맞추기](../ch05/src/MultiArrEx4.java)