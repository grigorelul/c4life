import HomeCSS from './Home.module.css';
import axios from 'axios';

export default function Home() {
    const test = async (name : string) => {
        await axios.post('http://localhost:8080/test/', {username: name})
            .then((response) => {
                console.log(response);
            })
            .catch((error) => {
                console.log(error);
            });
    };


    return (
        <div className={HomeCSS.Home}>
            <div className={HomeCSS.button} onClick={() => test("name")}>
                Test
            </div>
        </div>
    );
}