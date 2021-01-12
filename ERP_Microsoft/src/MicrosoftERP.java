import core.ProdutoImportacao;
import microsoftinterface.InterfaceMS;

public class MicrosoftERP {
	public static void main(String[] args) {
	   InterfaceMS ims = new ProdutoImportacao();
	   
	   ims.MS_extractInvoice(" <xml>...</xml>");
	}

}
