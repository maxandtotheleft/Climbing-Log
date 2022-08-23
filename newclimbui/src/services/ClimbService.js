import axios from 'axios';

export default {

    getAllClimbs() {
        return axios.get('http://localhost:8080/climbs').then((response => {
            const climbs = response;
            return climbs;
        }))
    },
    addClimb(climb){
        return axios.post('http://localhost:8080/addClimb', climb).then((response => {
            const climb = response;
            return climb;
        }))
    },
    deleteClimb(id){
        return axios.delete(`http://localhost:8080/${id}`)
        // .then((response => {
        //     const climb = response;
        //     return climb;
        // }))
    }

}