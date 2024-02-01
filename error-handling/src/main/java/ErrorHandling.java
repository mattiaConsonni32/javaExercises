import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws CustomCheckedException{
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception{
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        try {
            throw new CustomUncheckedException();
        }
        catch (CustomUncheckedException e) {
            throw new CustomUncheckedException();
        }
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        try {
            throw new CustomUncheckedException(message);
        }
        catch (CustomUncheckedException e) {
            throw new CustomUncheckedException(message);
        }
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException{
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        try {
            throw new CustomUncheckedException();
        } 
        catch (CustomUncheckedException e) {
            throw new CustomUncheckedException();
        }
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        try {
            throw new CustomUncheckedException(message);
        } 
        catch (CustomUncheckedException e) {
            throw new CustomUncheckedException(message);
        }
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        Optional<Integer> opt;
        try {
            opt = Optional.of(Integer.valueOf(integer));
        }
        catch (NumberFormatException e) {
            opt = Optional.ofNullable(null);
        }
        return opt;
    }

}
