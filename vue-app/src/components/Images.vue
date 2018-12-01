<template>
    <div class="vue-images">
        <h1 class="text-center" style="text-align: center">Image Rendering</h1>
        <div class="container-fluid">
            <div class="container-fluid">
                <ul v-if="results && results.length">
                    <div class="col-md-8 blog-main">
                        <div class="container-border container" v-for="result in results">
                            <div class="row">
                                <div class="col-md-4">
                                    <h1 :id="`image_text_${result.ID}`">{{result.image_alt_text}}</h1>
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" v-bind:src="result.image_url" alt="Card image cap" :id="`image_${result.ID}`"/>
                                    </div>
                                </div>
                            </div>
                            <hr>
                        </div>
                    </div>
                </ul>
                <ul v-if="errors && errors.length">
                    <li v-for="error of errors">
                        {{error.message}}
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        name: "vue-images",
        data() {
            return {
                results: [],
                errors: []
            }
        },
        mounted() {
            axios.get("http://152.46.17.4:8080/pyapi/images").then(response => {
                this.results = response.data;
            }).catch(e => {
                this.errors.push(e)
            })
        }
    }
</script>