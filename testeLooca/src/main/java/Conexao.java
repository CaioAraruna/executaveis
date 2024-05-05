import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    JdbcTemplate conexaoDoBanco;
    JdbcTemplate conexaoDoBancoVM;
    public Conexao() {
        BasicDataSource dataSourceLocal = new BasicDataSource();


        dataSourceLocal.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceLocal.setUrl("jdbc:mysql://34.230.75.168:3306/testeMemoria");
        dataSourceLocal.setUsername("SentinelSystem");
        dataSourceLocal.setPassword("urubu100");
        conexaoDoBanco = new JdbcTemplate(dataSourceLocal);

//        BasicDataSource dataSourceVM = new BasicDataSource();
//        dataSourceVM.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSourceVM.setUrl("jdbc:mysql://192.168.0.8:3306/testeMemoria");
//        dataSourceVM.setUsername("SentinelSystem");
//        dataSourceVM.setPassword("urubu100");
//        conexaoDoBancoVM = new JdbcTemplate(dataSourceVM);
    }

    public JdbcTemplate getConexaoDoBanco() {

        return conexaoDoBanco;
    }

//    public JdbcTemplate getConexaoDoBancoVM() {
//        return conexaoDoBancoVM;
//    }
}
