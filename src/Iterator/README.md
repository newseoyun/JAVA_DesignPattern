## Iterator Pattern
x사이즈의 책장을 만들고 책을 순서대로 하나씩 추가한다.   
책장의 책을 순서대로 출력한다.
***
> **Interface**  
>   Aggregate, Iterator  
>
> **Class**   
>   Book, BookShelf(Aggregate), BookShelfIterator(Iterator)
***
장점 : 구현에 상관없이 Iterator를 사용할 수 있다.   
(BookShelf 내의 다른 메소드를 어떻게 수정해도 변함없이 동작함.)   
