
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinu() {
		return minu;
	}
	public void setMinu(int minu) {
		this.minu = minu;
	}
	public int getSegu() {
		return segu;
	}
	public void setSegu(int segu) {
		this.segu = segu;
	}
	
	public String exibirHoraUniversal() {
		String horaUniversal;
		horaUniversal = formataNumero(hora) + ":";
		horaUniversal = horaUniversal + formataNumero(minu) + ":";
		horaUniversal = horaUniversal + formataNumero(segu);

		return horaUniversal;
	}

	public String exibirHoraPadrao() {
		String horaPadrao;
		String sufixo;
		
		if (hora == 0) {
			horaPadrao = formataNumero(12);
			sufixo = "AM";
		}
		else if (hora == 12) {
			horaPadrao = formataNumero(12);
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = formataNumero(hora);
			sufixo = "AM";
		}
		else {
			horaPadrao = formataNumero(hora-12);
			sufixo = "PM";
		}
		
		return horaPadrao +":"+formataNumero(minu)+":"+formataNumero(segu)+sufixo;
	}
	
	
	public String formataNumero(int numero) {
		String res="";
		if (numero < 10) {
			res = "0"+numero;
		}
		else {
			res = numero+"";
		}
		return res;
	}
}
