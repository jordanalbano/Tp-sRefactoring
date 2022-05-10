package ar.unrn.eje2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class CsvData implements Csv {
	private List<String[]> csvData;

	public CsvData() {
		csvData = new ArrayList<String[]>();
	}

	@Override
	public void addCsvData(CSVReader reader) throws IOException {
		String[] row = null;
		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}
		reader.close();
		csvData.remove(0);

	}

	@Override
	public void addContainsKeys(Map<String, String> options) {
		if (options.containsKey("company_name")) {
			Predicate<String> lambda = (String[] s) -> s[1].equals(options.get("company_name"));
			csvData = Filtro.filtrar(lambda, csvData);
		}
		if (options.containsKey("city")) {
			Predicate<String> predicado = (String[] s) -> s[4].equals(options.get("city"));
			csvData = Filtro.filtrar(predicado, csvData);
		}
		if (options.containsKey("state")) {
			Predicate<String> predicado = (String[] s) -> s[5].equals(options.get("state"));
			csvData = Filtro.filtrar(predicado, csvData);
		}
		if (options.containsKey("round")) {
			Predicate<String> predicado = (String[] s) -> s[9].equals(options.get("round"));
			csvData = Filtro.filtrar(predicado, csvData);
		}
	}

	@Override
	public List<Map<String, String>> putsOutput() {
		List<Map<String, String>> output = new ArrayList<Map<String, String>>();
		for (int i = 0; i < csvData.size(); i++) {
			Map<String, String> mapped = new HashMap<String, String>();
			this.putsMapped(mapped, i);
			output.add(mapped);
		}

		return output;
	}

	public Map<String, String> putsMapped(Map<String, String> mapped, int posicion) {
		String[] allowedItems = { "permalink", "company_name", "number_employees", "category", "city", "state",
				"funded_date", "raised_amount", "raised_currency", "round" };

		for (int j = 0; j < allowedItems.length; j++) {
			mapped.put(allowedItems[j], csvData.get(posicion)[j]);
		}
		return mapped;

	}

	@Override
	public String[] get(int position) {

		return this.csvData.get(position);
	}

	@Override
	public int size() {

		return this.size();
	}

}
