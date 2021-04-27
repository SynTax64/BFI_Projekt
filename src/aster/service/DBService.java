package aster.service;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBService {

	void angestelltenAnzeigen(Connection connection) throws SQLException;

	boolean neueAngestellterErfassen(Connection connection, String name, double grundGehalt, double ortzuschlag,
			double zulage) throws SQLException;

	StringBuilder nachEinerAngestellterSuchen(Connection connection, String name) throws SQLException;

	int angestellterAusDerListeEntfernen(Connection connection, int id) throws SQLException;

	boolean angestellterDatenAendern(Connection connection, int id, String name, double grundGehalt, double ortzuschlag,
			double zulage) throws SQLException;

	boolean anmeldeDatenValidieren(Connection connection);
}
