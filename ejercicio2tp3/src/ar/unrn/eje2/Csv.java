package ar.unrn.eje2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public interface Csv {

	void addCsvData(CSVReader reader) throws IOException;

	List<Map<String, String>> putsOutput();

	void addContainsKeys(Map<String, String> options);

	Map<String, String> putsMapped(Map<String, String> mapped, int i);

	String[] get(int position);

	int size();
}
