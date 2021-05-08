import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

function Home() {
    return (
        <>
            <NavBar></NavBar>
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Analise do desempenho de vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Accesar o DashBoard
                    </Link>
                </div>
            </div>
            <Footer></Footer>
        </>
    );
}
export default Home;
