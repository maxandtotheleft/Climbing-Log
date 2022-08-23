<template>
<div>
  <!-- <div v-for="climb in climbs" v-bind:key="climb.id">{{climb.climbName}}</div>
  <div v-for="climb in climbs" v-bind:key="climb.id">{{climb.area}}</div>
  <div v-for="climb in climbs" v-bind:key="climb.id">{{climb.grade}}</div> -->
  <table class="climbs">
  <tr>
    <th>Climb Name</th>
    <th>Grade</th>
    <th>Area</th>
  </tr>
</table>

    <div>
     <div v-for="climb in climbs" v-bind:key="climb.id"> <button @click="deleteIt(climb.climbId)">DELETE</button>CLIMB NAME: {{climb.climbName}} GRADE: V{{climb.grade}} AREA: {{climb.area}}</div>
    </div>

  
 
 

  </div>
</template>

<script>
import ClimbService from "@/services/ClimbService";


export default {
 name: "climb-list",
  data() {
    return {
    climbs: [],
    climb: {
        climbId: "",
        climbName: "",
        area: "",
        grade: ""    
    } 
    };
  },
  methods: {
    deleteIt(id){
      ClimbService.deleteClimb(id)
    }
  },
  created() {
    ClimbService.getAllClimbs().then((response) => {
      this.climbs = response.data;
    //   might need .data after response if more than one climb
    });
  },
};

</script>

<style>
.climbs{
  margin: auto;
  width: 100%;
}
</style>