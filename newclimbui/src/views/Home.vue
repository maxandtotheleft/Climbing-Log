<template>
<div>
<div>HOME</div>
<router-link v-bind:to="{ name: 'my-climbs'}">View my climbs</router-link>
</div>
</template>

<script>
export default {
 name: "home-view",
  data() {
    return {
   
    };
  },
  created() {

  },
};
</script>

<style>

</style>