package aster.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBServiceImpl implements DBService {

	private static final long serialVersionUID = 4228422636590684124L;

	@Override
	public void angestelltenAnzeigen(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery("SELECT * FROM Mitarbeiter");

		while (results.next()) {
			System.out.println(
					results.getString("id") + ", " + results.getString("name") + ", " + results.getString("grundGehalt")
							+ ", " + results.getString("ortzuschlag") + ", " + results.getString("zulage"));
		}
	}

	@Override
	public boolean neueAngestellterErfassen(Connection connection, String name, double grundGehalt, double ortzuschlag,
			double zulage) throws SQLException {

		String query = "INSERT INTO Angestellter (name, grundGehalt, ortzuschlag, zulage) VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, grundGehalt);
		preparedStatement.setDouble(3, ortzuschlag);
		preparedStatement.setDouble(4, zulage);

		boolean isHinzugefuegt = preparedStatement.execute();
		connection.close();

		return isHinzugefuegt;
	}

	@Override
	public StringBuilder nachEinerAngestellterSuchen(Connection connection, String name) throws SQLException {
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM Angestellter WHERE name=\'" + name + "\'";
		ResultSet results = statement.executeQuery(query);
		StringBuilder output = new StringBuilder();
		while (results.next()) {

			output.append(String.format("%d, %s, %d, %d, %d\n", results.getString("id"), results.getString("name"),
					results.getString("grundGehalt"), results.getString("ortzuschlag"), results.getString("zulage")));
		}
		return output;
	}

	@Override
	public int angestellterAusDerListeEntfernen(Connection connection, int id) throws SQLException {
		String query = "DELETE FROM Angestellter WHERE id=" + id;
		Statement statement = connection.createStatement();

		int isgeLoescht = statement.executeUpdate(query);
		return isgeLoescht;
	}

	@Override
	public boolean angestellterDatenAendern(Connection connection, int id, String name, double grundGehalt,
			double ortzuschlag, double zulage) throws SQLException {
		String query = "UPDATE TABLE Angestellter SET name =\'?\', grundGehalt=?, ortzuschlag=?, zulage=? WHERE id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, grundGehalt);
		preparedStatement.setDouble(3, ortzuschlag);
		preparedStatement.setDouble(4, zulage);
		preparedStatement.setInt(5, id);

		return preparedStatement.execute();
	}

	@Override
	public boolean anmeldeDatenValidieren(Connection connection) {
		return false;
	}

}
