import axios from 'axios';

export default {

    getAllClimbs() {
        return axios.get('http://localhost:8080/climbs').then((response => {
            const climbs = response;
            return climbs;
        }))
    },
    addClimb(climb){
        return axios.post('http://localhost:8080/addclimb', climb).then((response => {
            const climb = response;
            return climb;
        }))
    }

}