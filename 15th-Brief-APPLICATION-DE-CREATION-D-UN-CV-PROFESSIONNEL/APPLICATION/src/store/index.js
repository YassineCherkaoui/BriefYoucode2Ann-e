import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    name: "",
    desc: "",

    email: "",
    phone: "",
    adress: "",
    github: "",

    company: "",
    post: "",
    postdisc: "",
    from: "",
    to: "",

    university: "",
    branch: "",

    about: "",
  },
  mutations: {
    setName(state, value) {
      state.name = value;
    },
    setDesc(state, value) {
      state.desc = value;
    },

    setEmail(state, value) {
      state.email = value;
    },
    setPhone(state, value) {
      state.phone = value;
    },
    setAdress(state, value) {
      state.adress = value;
    },
    setGitHub(state, value) {
      state.github = value;
    },

    setCompany(state, value) {
      state.company = value;
    },
    setPost(state, value) {
      state.post = value;
    },
    setPostdisc(state, value) {
      state.postdisc = value;
    },
    setFrom(state, value) {
      state.from = value;
    },

    setTo(state, value) {
      state.to = value;
    },

    setUniversity(state, value) {
      state.university = value;
    },
    setBranch(state, value) {
      state.branch = value;
    },
    setAbout(state, value) {
      state.about = value;
    },
  },
  modules: {},
});
