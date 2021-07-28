# Chapter 07 - 객체지향 프로그래밍 2
---

### 상속
- 정의: 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
- 장점
    - 적은 양의 코드로 새로운 클래스 작성 가능
    - 코드의 공통적 관리로 인해 추가 및 변경에 용이
  
- 상속계층도(class hierarchy): 클래스 간 상속관계를 그림으로 표현한 것
- 상속에 사용되는 키워드 = `extends`

> - 생성자와 초기화 블럭은 상속되지 않으며 멤버만 상속됨
> - 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많음

> 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성

### 클래스간의 관계 - 포함관계(Composite)
- 다른 클래스를 멤버변수를 선언하여 포함시키

### 클래스간의 관계 결정하기
> - 상속관계 : '~은 ~이다.(is-a)'
> - 포함관계 : '~은 ~을 가지고 있다.(has-a)'

### 단일 상속(Single Inheritance)
- 하나 이상의 클래스로부터 상속을 받을 수 없음

### Object클래스 - 모든 클래스의 조상
- 모든 상속계층도의 최상위에는 `Object클래스` 위치

### 오버라이딩(Overriding)
- 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
- 조건
  - 이름이 같아야 함
  - 매개변수가 같아야 함
  - 반환타입이 같아야 함
  
- 제약
  - 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음
  - 예외는 조상 클래스의 메서드보다 많이 선언할 수 없음
  - 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없음
  
### 오버라이딩 vs 오버로딩
> - 오버로딩(overloading): 기존에 없는 새로운 메서드를 정의하는 것(new)
> - 오버라이딩(overriding): 상속받은 메서드의 내용을 변경하는 것(change, modify)
  
  ```java
  class Parent {
    void parentMethod() {}  
  }
  
  class Child extends Parent {
    void parentMethod() {} // 오버라이딩
    void parentMethod(int i) {} // 오버로딩
    
    void childMethod() {}
    void chileMethod(int i) {} // 오버로딩
    
  }
  ```

### super
- 상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 경우 `super`를 붙여 구별

### super() - 조상 클래스의 생성자
- Object클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자, this() 또는 super()를 호출해야 함. 그렇지 않으면 컴파일러가 자동적으로 'super();'를 생성자의 첫줄에 삽입
- 클래스: 어떤 클래스의 인스턴스를 생성할지
- 생성자: 선택한 클래스의 어떤 생성자를 이용해서 인스턴스를 생성할 지

- Point3D() -> Point3D(int x, int y, int z) -> Point(int x, int y) -> Object()

### package와 import
- 패키지(package)
  - 클래스의 묶음
  - 클래스가 물리적으로 하나의 클래스파일(.class)인 것과 같이 패키지는 물리적으로 하나의 디렉토리
  
> - 하나의 소스파일에는 첫 번째 문장으로 단 한 번의 패키지 선언만 허용
> - 모든 클래스는 반드시 하나의 패키지에 속해야 함
> - 패키지는 점(.)을 구분자로 계층구조 구성 가능
> - 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리

- import문
  - 클래스의 패키지를 미리 명시
  - 순서
    1. package문
    2. import문
    3. 클래스 선언
  
- static import문
  - static 멤버를 호출할 때 클래스 이름 생략 가능
  
### 제어자(modifier)
- 접근 제어자: public, protected, default, private
- 그 외: static, final, abstract, native, transient, synchronized,volatile
- 접근 제어자는 한 번에 하나만 선택해서 사용

### static - 클래스의, 공통적인
- 인스턴스와 관계없이 같은 값을 갖음
- 사용가능한 곳 : 멤버변수, 메서드, 초기화 블럭
- 인스턴스 멤버를 사용하지 않는 메서드는 `static`을 붙이자!

### final - 마지막의, 변경될 수 없는
- 변수에 사용하면 변경 불가능한 상수가 되고, 메서드에 사용하면 오버라이딩 불가능
- 사용가능한 곳: 클래스, 메서드, 멤버변수, 지역변수

### abstract - 추상의, 미완성의
- 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드 선언
- 사용가능한 곳: 클래스, 메서드

### 접근 제어자(access modifier)
제어자|같은 클래스|같은 패키지|자손 클래스|전체
---|---|---|---|---
public|O|O|O|O
protected|O|O|O|X
(default)|O|O|X|X
private|O|X|X|X

대상|사용가능한 접근 제어자
---|---
클래스|public, (default)
메서드, 멤버변수|public, protected, (default), private
지역변수|없음

- 접근 제어자 사용하는 이유
  - 외부로부터 데이터를 보호하기 위해
  - 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해
  
- `getter`
  - 단순히 멤버변수의 값을 반환함
  
- `setter`
  - 매개변수에 지정된 값을 검사하여 조건에 맞는 값일 때만 멤버변수의 값 변경
  
- 생성자에 접근 제어자를 사용함으로써 인스턴스 생성 제한 가능

##### 제어자(modifier)의 조합
대상|사용가능한 제어자
---|---
클래스|public, (default), final, abstract
메서드|모든 접근 제어자, final, abstract, static
멤버변수|모든 접근 제어자, final, static
지역변수|final

> 1. 메서드에 static과 abstract 동시 사용 불가
> 2. 클래스에 abstract와 final 동시 사용 불가
> 3. abstract 메서드의 접근 제어자가 private일 수 없음
> 4. 메서드에 private과 final을 같이 사용할 필요 없음