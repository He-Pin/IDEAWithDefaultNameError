/**
 * @author kerr
 **/
public class UseWithDefault extends WithDefault {
    public static void main(String[] args) {
        WithDefault withDefault = new UseWithDefault();
        System.out.println(withDefault.overload("arg1"));
        System.out.println(withDefault.overload(null,"default"));
    }
}
