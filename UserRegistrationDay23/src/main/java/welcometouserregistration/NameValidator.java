package welcometouserregistration;

@FunctionalInterface
public
interface NameValidator {
    boolean validate(String name);
}