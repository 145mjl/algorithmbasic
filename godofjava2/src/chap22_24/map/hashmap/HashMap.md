## HashMap

추상 클래스 AbstractMap<K,V> 를 확장하였으며, Serializable, Cloneable, Map<E> 인터페이스를 구현하였다.

### 특성
* HashMap의 키는 기본 자료형, 참조 자료형 모두 될 수 있다. 단 사용자 생성 클래스를 키로 사용할 때에는 hashcode()와 equals() 메소드를 잘 구현해야 한다.
  * HashMap에 객체가 들어가면 hashcode()의 결과에 따른 bucket이 만들어진다. 버켓에는 '서로 다른 키지만 hashcode() 결과는 같은 여러 개의 값'이 저장될 수 있다.
  * 따라서 get() 메소드를 호출하면 hashcode() → equals() 를 호출하여 동일한 값을 찾게 된다.