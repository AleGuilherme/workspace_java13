import core.ProdutoImportacao;
import oracleinterface.ORAInterface;

public class OracleERPMain {
	public static void main(String[] args) {
		ORAInterface inter;
		
		inter = new ProdutoImportacao();
		
		inter.ORA_ERP_InvoiceManager_extractor(" <xml>...</xml>");
		
	}

}
