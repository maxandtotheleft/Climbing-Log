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
  <tr>
    <td v-for="climb in climbs" v-bind:key="climb.id">{{climb.climbName}}</td>
    <td v-for="climb in climbs" v-bind:key="climb.id">{{climb.grade}}</td>
    <td v-for="climb in climbs" v-bind:key="climb.id">{{climb.area}}</td>

  </tr>
 
</table>
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