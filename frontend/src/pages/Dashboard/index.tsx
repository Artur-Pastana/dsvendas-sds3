import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonuChart from "components/DonuChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Dashboard () {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">DashBoard do Aplicativo</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Transacoes com Sucesso (%)</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Transacoes com sucesso</h5>
                        <DonuChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Todas As vendas</h2>
                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;