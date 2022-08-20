<template>
    <div>
    <!-- <form class="submitForm" v-on:submit.prevent="">
      <label>Climb Name</label>
      <input class="input" v-model="climb.name" />
        <label>Grade</label>
      <input class="input" v-model="climb.grade" />
     <label>Area</label>
      <input class="input" v-model="climb.area" />
      <input type="submit" value="Save" />
    </form> -->
  </div>

</template>

<script>
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
  }
}
</script>

<style>

</style>