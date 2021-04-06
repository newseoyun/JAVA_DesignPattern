# Template Method Pattern
상위 클래스에 메소드의 탬플릿을 기술해두고 하위 클래스들은 기술된 탬플릿을 구현한다.   
이를 인스턴스 생성에 응용한 것이 Factory Pattern 이다.
***
> *CharDisplay*, *StringDisplay* 두 클래스가 *AbstractDisplay*를 바라봄(상속받음)   
> 같은 탬플릿이만 세부적인 구현만 다름.
***
"상위 클래스형의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다."   
The Liskov Substitution Principle(LSP)