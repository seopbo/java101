public class PhoneBox<T extends Phone> extends Box<T> {
    public void handsFreeCall (String numberString) {
        this.get().call(numberString);
    }
}