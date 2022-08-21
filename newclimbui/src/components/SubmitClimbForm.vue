<template>
    <div>
    <form class="submitForm" v-on:submit.prevent="addClimb">
      <label>Climb Name</label>
      <input class="input" v-model="climb.climbName" />
        <label>Grade</label>
      <input class="input" v-model="climb.grade" />
     <label>Area</label>
      <input class="input" v-model="climb.area" />
      <input type="submit" value="Save" />
    </form>
  </div>

</template>

<script>
import ClimbService from '../services/ClimbService';
export default {
data(){
    return {
         climb: {
        climbId: "",
        climbName: "",
        area: "",
        grade: ""    
    } 
   }
  },
  methods: {
    addClimb(){
    ClimbService.addClimb(this.climb).then((response) => {
        if (response.status === 201 || response.status === 200) {

                    this.$router.push("/");


        }
      });
  }
  }
}
</script>

<style>

</style>