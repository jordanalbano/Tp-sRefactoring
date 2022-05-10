package src.eje3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import src.eje3.modelo.AlquilerDeAutoTipoDeGasto;
import src.eje3.modelo.CenaTipoDeGasto;
import src.eje3.modelo.DesayunoTipoDeGasto;
import src.eje3.modelo.Fecha;
import src.eje3.modelo.Gasto;
import src.eje3.modelo.Gastos;
import src.eje3.modelo.ReporteDeGastos;

class ReporteDeGastosTest {

	@Test
	void testReporteDeGastos() {
		Fecha fecha = new Fecha();
		ReporteDeGastos reporte = new ReporteDeGastos(fecha);
		ArrayList<Gasto> gastos = new ArrayList<>();
		// TipoDeGasto t = new TipoDeGasto("DESAYUNO");
		gastos.add(new Gasto(new CenaTipoDeGasto(6000)));
		gastos.add(new Gasto(new DesayunoTipoDeGasto(600)));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 400000));
		// //gastos.add(new Gasto(new DesayunoTipoDeGasto(), 800));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 7));
		gastos.add(new Gasto(new AlquilerDeAutoTipoDeGasto(100)));
		Gastos g = new Gastos(gastos);
		assertEquals(
				"Fecha De Reporte: 2022-04-25 \n" + "Detalles: \n" + "	Cena 6000 $   X\n" + "	Desayuno 600 $   \n"
						+ "	Alquiler De Auto 100 $   \n" + "Monto De Comidas: 6600\n" + "Monto Total De Gastos: 6700",
				reporte.gastos(g));
	}

	@Test
	void testGastosDeComida() {
		Fecha fecha = new Fecha();
		ReporteDeGastos reporte = new ReporteDeGastos(fecha);
		ArrayList<Gasto> gastos = new ArrayList<>();
		// TipoDeGasto t = new TipoDeGasto("DESAYUNO");
		gastos.add(new Gasto(new CenaTipoDeGasto(6000)));
		gastos.add(new Gasto(new DesayunoTipoDeGasto(600)));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 400000));
		// //gastos.add(new Gasto(new DesayunoTipoDeGasto(), 800));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 7));
		gastos.add(new Gasto(new AlquilerDeAutoTipoDeGasto(600)));
		Gastos g = new Gastos(gastos);
		assertEquals(6600, g.gastosDeComida());
	}

	@Test
	void testGastoTotal() {
		Fecha fecha = new Fecha();
		ReporteDeGastos reporte = new ReporteDeGastos(fecha);
		ArrayList<Gasto> gastos = new ArrayList<>();
		// TipoDeGasto t = new TipoDeGasto("DESAYUNO");
		gastos.add(new Gasto(new CenaTipoDeGasto(6000)));
		gastos.add(new Gasto(new DesayunoTipoDeGasto(600)));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 400000));
		// //gastos.add(new Gasto(new DesayunoTipoDeGasto(), 800));
		// gastos.add(new Gasto(new DesayunoTipoDeGasto(), 7));
		gastos.add(new Gasto(new AlquilerDeAutoTipoDeGasto(600)));
		Gastos g = new Gastos(gastos);
		assertEquals(7200, g.montoDeGastos());
	}

}
