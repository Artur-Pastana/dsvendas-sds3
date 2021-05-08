import ImgDsDark from 'assets/img/ds_dark.svg';
import ImgReact from 'assets/img/react.svg';
import ImgJava from 'assets/img/java.svg';
import { Link } from 'react-router-dom';

function NavBar() {
    return (
        <div>
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
                <div className="container">
                    <nav className="my-2 my-md-0 mr-md-3">
                        <Link to="/">
                            <img src={ImgReact} alt="DevSuperior" width="80" />
                            <img src={ImgJava} alt="DevSuperior" width="80" />
                            <img src={ImgDsDark} alt="DevSuperior" width="120" />
                        </Link>
                    </nav>
                </div>
            </div>
        </div>
    );
}

export default NavBar;