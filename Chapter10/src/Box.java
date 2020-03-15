public class Box<T> {
    /*
        T는 타입 파라미터라고 함. 이와 같이 타입 파라미터를 받는 클래스를 제네릭 클래스라고 한다.
     */
    private T something;

    public void set (T object) {
        this.something = object;
    }

    public T get() {
        return something;
    }
}
