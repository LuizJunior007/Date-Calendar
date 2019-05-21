package pacote1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ss HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:45:07Z"));
		System.out.println(sdf.format(d));
			Calendar cal = Calendar.getInstance();                      // instanciaçao do objeto calendar
			cal.setTime(d);										// seleciona o objeto calendar com a data e hora 
			cal.add(Calendar.HOUR_OF_DAY, 3);				// adiciona ao calendar quantos horas quer adiantar
			d = cal.getTime();												
		System.out.println(sdf.format(d));
		

	}

}
