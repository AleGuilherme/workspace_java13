
// crio a "minha exceção" para verificar, por exemplo, violações nas regras de negócios
public class IsiException extends RuntimeException {
	public IsiException(String msg) {
		super(msg);
	}

}
