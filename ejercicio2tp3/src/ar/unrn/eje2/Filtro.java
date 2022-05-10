package ar.unrn.eje2;

import java.util.ArrayList;
import java.util.List;

public class Filtro {
	public static List<String[]> filtrar(Predicate<String> predicado, List<String[]> csvData) {
		List<String[]> csvDataFinal = new ArrayList<String[]>();
		for (int i = 0; i < csvData.size(); i++) {
			if (predicado.execute(csvData.get(i))) {
				csvDataFinal.add(csvData.get(i));
			}
		}
		return csvDataFinal;
	}

}
