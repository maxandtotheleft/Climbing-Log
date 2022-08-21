<template>
  <div>
   <div class="title">MY CLIMBS</div> 
    <div class="climbs">
    <climb />
    </div>
    <submit-climb-form />
    <router-link class="goHome" v-bind:to="{ name: 'home'}">Go Home</router-link>
  </div>
</template>

<script>
import Climb from '@/components/Climb.vue'
import SubmitClimbForm from '@/components/SubmitClimbForm.vue'

export default {
    name: "my-climbs",
  components: { 
    Climb, 
    SubmitClimbForm
    },

}
</script>

<style>
.title{
  display: inline-block;
  padding: 0% 1% 0% 1%;
  margin: 1%;
  border: solid 0px black;
  background-color: rgb(217, 238, 245);
  border-radius: 20px;
} 
.climbs {
  background-color: antiquewhite;
  width: 80%;
  border: solid 0px black;
  border-radius: 20px;
}
.goHome {
}
</style>