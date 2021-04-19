import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
// import nameAndDesc from "../components/NameAndDesc.vue";
// import PersonnalInfo from "../components/PersonalInfo.vue";
// import exprerience from "../components/Experience.vue";
// import Education from "../components/Education.vue";
// import Skills from "../components/Skills.vue";
// import About from "../components/About.vue";
import Cvprev from "../components/CvPrev.vue";
import Download from "../components/Download.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/cvprev",
    name: "Cvprev",
    component: Cvprev,
  },
  {
    // download
    path: "/download",
    name: "Download",
    component: Download,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
