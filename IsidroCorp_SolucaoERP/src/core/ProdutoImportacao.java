package core;

import microsoftinterface.InterfaceMS;
import oracleinterface.ORAInterface;
import sapinterface.InterfaceSAP;

public class ProdutoImportacao implements InterfaceMS, ORAInterface, InterfaceSAP{
	
	public void extrairDadosInvoice(String conteudo) {
		System.out.println("ISIDROCORP - Extraindo conteúdo" + conteudo);
	}

	/* neste caso, eu me "adapto" à interface da Microsoft, porém na implementação dela, eu chamo a minha "inteligência"
	 * 
	 */
	@Override
	public void MS_extractInvoice(String invoice) {
		extrairDadosInvoice(invoice);
		
	}

	@Override
	public void ORA_ERP_InvoiceManager_extractor(String invoice) {
		extrairDadosInvoice(invoice);
		
	}

	@Override
	public void SAP_InvoiceExtractorMainModule(String invoice) {
		extrairDadosInvoice(invoice);
		
	}

}
